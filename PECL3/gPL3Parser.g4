 parser grammar gPL3Parser; 
 

options{
     tokenVocab = gPL3Lexer;
     language = Java;
 }
identificador: ID;
pfinfuncion:PFINFUNCION;
prog: ((algoritmo|funcion|comentario) TERMINAL)*;
definicion: PDEFINIR identificador (COMA identificador)* PCOMO PTIPOS PUNTOCOMA?;
algoritmo: PALGORITMO identificador TERMINAL? (linea|bloque)* PFINALGORITMO;
si: PSI operacion PENTONCES (linea*|si) (PSINO (linea*|si))? PFINSI TERMINAL;
para: PPARA operacion PHASTA (DIGITO|identificador) PHACER linea* PFINPARA TERMINAL;
mientras: PMIENTRAS operacion PHACER (linea|si)* PFINMIENTRAS TERMINAL?;
repetir:PREPETIR linea* PHASTAQUE operacion TERMINAL;
segun: PSEGUN identificador PHACER ((CADENA|DIGITO) DOSPUNTOS TERMINAL linea*)+ 
        (PDEOTROMODO DOSPUNTOS TERMINAL linea*)? PFINSEGUN TERMINAL; 
funcion: cabezafuncion cuerpofuncion pfinfuncion;
argumentos: identificador|operacion (COMA identificador|operacion)*;
dimension: PDIMENSION identificador CI (DIGITO|identificador (COMA DIGITO|identificador)*) CD;
bloque: definicion
    | si
    | para
    | mientras 
    | repetir
    | segun
    | dimension
    ;

expresion: PESCRIBIR operacion comentario?
    | PLEER identificador comentario?
    | comentario
    | operacion
    ;
llamadaFuncion:identificador PI argumentos? PD;

operacion: identificador ASIGNACION expresion
    | identificador
    | (DIGITO|identificador) ((MAS|MENOS) (identificador|DIGITO))*
    | (CADENA|identificador) ((MAS|COMA) (CADENA|identificador))*
    | identificador IGUAL (identificador|CADENA)
    | identificador (IGUAL|MAYOR|MENOR) DIGITO
    | llamadaFuncion
    | array ASIGNACION array
    | PI operacion PD
    | operacion Y operacion
    ;

array: identificador CI (DIGITO|identificador|operacion (COMA (DIGITO|identificador)*))CD;
textos:TEXTOCOMENTARIOML+
    |TEXTOCOMENTARIOUL+
    ;
linea:expresion PUNTOCOMA?;

cabezafuncion: PFUNCION identificador ASIGNACION? identificador? PI argumentos? PD TERMINAL;
cuerpofuncion: (linea|TERMINAL)*;
comentario: 
      COMENTARIOABRIR (textos|TERMINAL)* COMENTARIOCERRAR
      | COMENTARIOLINEA textos* FINAL_COMENTARIO_UL
    ;
