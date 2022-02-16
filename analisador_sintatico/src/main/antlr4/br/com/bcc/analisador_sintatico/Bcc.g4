grammar Bcc;

TIPO_VARIAVEIS
        : 'INTEIRO'|'REAL';

NUMINTEIRO
        :('0'..'9')+;

NUMREAL
        :('0'..'9')+('.'('0'..'9')+)?;

VARIAVEL
        :('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
OP_ARITIMETICO1
        :'+'|'-';

OP_ARITIMETICO2
        :'*'|'/';
OP_RELACIONAL1
        :'>'|'<'|'=';
OP_RELACIONAL2
        :'<='|'>='|'==';

programa
        :':' 'DECLARACOES' listaDeclaracoes ':' 'ALGORITMO' listaComandos;

listaDeclaracoes
        : declaracao listaDeclaracoes | declaracao;

declaracao
        : VARIAVEL '->' TIPO_VARIAVEIS;

listaComandos
        : comando listaComandos | comando;

comando
        : comandoAtribuir | comandoEntrada | comandoSaida;

comandoAtribuir
        : 'ATRIBUIR' expressaoAritmetica '->' VARIAVEL;

expressaoAritmetica
        :  fator OP_ARITIMETICO1 termo | termo;

termo
        : termo OP_ARITIMETICO2 fator | fator;

fator
        : NUMINTEIRO | NUMREAL | VARIAVEL;

comandoEntrada
        : 'LER' VARIAVEL;

comandoSaida
        :'ESCREVA' VARIAVEL;
