module fixaxao2 {
}

/*
Uma empresa qualquer deseja gerenciar seus funcion�rios, com base nessas informa��es crie uma classe Funcion�rio com os seguintes atributos:

nome
endere�o
telefone
sal�rio
data de admiss�o (MM/ANO, ex 03/2020, pode ser String).
data de demiss�o (MM/ANO, ex 03/2020, pode ser String)
Funcion�rios podem ser admitidos e instanciados na aplica��o da empresa.
 Quando um funcion�rio � admitido � poss�vel informar todos os dados exceto a data de demiss�o.

Existem tr�s situa��es que devem ser tratadas:

I.Se n�o for informado o sal�rio considerar o sal�rio m�nimo nacional;

II.Se n�o for informada a data de admiss�o considerar o dia de hoje (Na string coloque �dia de hoje�);

III.Podem n�o ser informadas a data de admiss�o e o sal�rio.

A classe funcion�rio tamb�m deve ter os seguintes m�todos:

void demitirFuncionario(string dataDemissao) - Nesse m�todo poder� ser informada a data da demiss�o e se n�o foi informada, considerar o dia de hoje.
void promoverFuncionario(int percentualPromocao) - O m�todo para promover o funcion�rio recebe um percentual de promo��o 
do tipo inteiro esse percentual deve ser acrescido ao sal�rio atual do funcion�rio. Caso este percentual n�o seja informado considere 3%.
 Ap�s construir a classe, realizar o upload no arquivo .java

*/