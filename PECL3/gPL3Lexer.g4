lexer grammar gPL3Lexer;

COMENTARIOABRIR: '/**' -> pushMode(COMENTARIO_MULTILINEA_MODE);
COMENTARIOLINEA: '//' -> pushMode(COMENTARIO_LINEA_MODE);

PALGORITMO: 'Algoritmo';
PFINALGORITMO: 'FinAlgoritmo';

PFUNCION: 'Funcion';
PFINFUNCION: 'FinFuncion'|'Fin Funcion';

PDEFINIR: 'Definir'|'DeFiNIr'|'DefiniR'|'definir';
PCOMO: 'Como';
PLEER: 'Leer';
PESCRIBIR:'Escribir';

PSI: 'Si';
PENTONCES: 'Entonces';
PSINO: 'SiNo';
PFINSI: 'FinSi'|'Fin Si';

PPARA:'Para'; 
PHASTA:'Hasta' ;
PHACER:'Hacer' ;
PFINPARA: 'FinPara';

PMIENTRAS:'Mientras';
PFINMIENTRAS:'FinMientras'|'Fin Mientras';

PREPETIR:'Repetir';
PHASTAQUE: 'Hasta Que';

PSEGUN: 'Segun';
PDEOTROMODO: 'De Otro Modo';
PFINSEGUN: 'FinSegun';

PTIPOS: 'Caracter'|'Entero'|'Real'|'Logico';

PDIMENSION: 'Dimension'|'DiMeNsIOn'|'dimension';

ASIGNACION:'<-';
MAS:'+';
MENOS:'-';
IGUAL:'=';
MAYOR:'<';
MENOR:'>';
COMA:',';
DOSPUNTOS: ':';
PI:'(';
PD:')';
CI:'[';
CD:']';
Y: '&';
DIGITO:[0-9]+;
ID:[a-zA-Z][A-Za-z0-9_-]+;
PUNTOCOMA: ';';
TERMINAL: [\r\n]+;
ESC: '\\'[btnr"\\];
CADENA:('\'' (ESC|.)*? '\'')|('"' (ESC|.)*? '"');
WS:[ \t\n\r�]+->skip;

mode COMENTARIO_MULTILINEA_MODE;
COMENTARIOCERRAR: '**/' ->popMode;
TEXTOCOMENTARIOML: .+?;

mode COMENTARIO_LINEA_MODE;
FINAL_COMENTARIO_UL: '\r\n'->popMode;
TEXTOCOMENTARIOUL: .+?;