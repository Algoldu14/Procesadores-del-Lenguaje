 parser grammar gPL2Parser; 
 

options{
     tokenVocab = gPL2Lexer;
     language = Java;
 }

prog: ((algoritmo|funcion|comentario) TERMINAL)*;
definicion: PDEFINIR ID (COMA ID)* PCOMO PTIPOS PUNTOCOMA?;
algoritmo: PALGORITMO ID TERMINAL? (linea|bloque)* PFINALGORITMO;
si: PSI operacion PENTONCES (linea*|si) (PSINO (linea*|si))? PFINSI TERMINAL;
para: PPARA operacion PHASTA (DIGITO|ID) PHACER linea* PFINPARA TERMINAL;
mientras: PMIENTRAS operacion PHACER (linea|si)* PFINMIENTRAS TERMINAL?;
repetir:PREPETIR linea* PHASTAQUE operacion TERMINAL;
segun: PSEGUN ID PHACER ((CADENA|DIGITO) DOSPUNTOS TERMINAL linea*)+ 
        (PDEOTROMODO DOSPUNTOS TERMINAL linea*)? PFINSEGUN TERMINAL; 
funcion: cabezafuncion cuerpofuncion PFINFUNCION;
argumentos: ID|operacion (COMA ID|operacion)*;
dimension: PDIMENSION ID CI (DIGITO|ID (COMA DIGITO|ID)*) CD;
bloque: definicion
    | si
    | para
    | mientras 
    | repetir
    | segun
    | dimension
    ;

expresion: PESCRIBIR operacion comentario?
    | PLEER ID comentario?
    | comentario
    | operacion
    ;


operacion: ID ASIGNACION expresion
    | ID
    | (DIGITO|ID) ((MAS|MENOS) (ID|DIGITO))*
    | (CADENA|ID) ((MAS|COMA) (CADENA|ID))*
    | ID IGUAL (ID|CADENA)
    | ID (IGUAL|MAYOR|MENOR) DIGITO
    | ID PI argumentos? PD
    | array ASIGNACION array
    | PI operacion PD
    | operacion Y operacion
    ;
array: ID CI (DIGITO|ID|operacion (COMA (DIGITO|ID)*))CD;
textos:TEXTOCOMENTARIOML+
    |TEXTOCOMENTARIOUL+
    ;
linea:expresion PUNTOCOMA?;

cabezafuncion: PFUNCION ID ASIGNACION? ID? PI argumentos? PD TERMINAL;
cuerpofuncion: (linea|TERMINAL)*;
comentario: 
      COMENTARIOABRIR (textos|TERMINAL)* COMENTARIOCERRAR
      | COMENTARIOLINEA textos* FINAL_COMENTARIO_UL
    ;
