module fixaxao2 {
}

/*
Uma empresa qualquer deseja gerenciar seus funcionários, com base nessas informações crie uma classe Funcionário com os seguintes atributos:

nome
endereço
telefone
salário
data de admissão (MM/ANO, ex 03/2020, pode ser String).
data de demissão (MM/ANO, ex 03/2020, pode ser String)
Funcionários podem ser admitidos e instanciados na aplicação da empresa.
 Quando um funcionário é admitido é possível informar todos os dados exceto a data de demissão.

Existem três situações que devem ser tratadas:

I.Se não for informado o salário considerar o salário mínimo nacional;

II.Se não for informada a data de admissão considerar o dia de hoje (Na string coloque “dia de hoje”);

III.Podem não ser informadas a data de admissão e o salário.

A classe funcionário também deve ter os seguintes métodos:

void demitirFuncionario(string dataDemissao) - Nesse método poderá ser informada a data da demissão e se não foi informada, considerar o dia de hoje.
void promoverFuncionario(int percentualPromocao) - O método para promover o funcionário recebe um percentual de promoção 
do tipo inteiro esse percentual deve ser acrescido ao salário atual do funcionário. Caso este percentual não seja informado considere 3%.
 Após construir a classe, realizar o upload no arquivo .java

*/