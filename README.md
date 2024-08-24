PROF.(A): Tiago de Almeida Lopes
ALUNO(A): Bruno Ricardo Machado
DATA: 23/08/2024

Git: https://github.com/brunorm86/solutis_lista04.git

### Lista de Exercícios 04 – Orientação a Objetos Avançada em Java

1. Criar uma interface AnimalIF com os métodos comer, moverse, dormir;
2. Criar uma classe abstrata AnimalAB que implementa a interface AnimalIF e define os métodos abstratos assinado na interface;
3. Crie as classes concretasCachorro, Gato, Elefante, Leão que herdarão da classe AnimalAB e sobrescreva os métodos abstratos comer, moverse, dormir; As ações desses métodos consistem em alterar o estado interno do objeto através dos atributos de instância que representam a quantidade de comida ingerida ao comer, a quantidade de caminho percorrido ao moverse, e a quantidade de horas ao dormir;
4. Crie uma classe Peixe e Pombo. De quem vamos herdar? Um peixe nada e um pombo voa então os métodos nadar e voar devem estar na classe abstrata Animal? Não. Então criem uma classe abstrata AnimalMarinhoAB ,AnimalVoadorAB, AnimalTerrestreAB que implementa a classe abstrata AnimalAB para representar a classe abstrata para animais marinhos e aéreos “que voam”.
5. Para que em todas as classes derivem os atributos de cada objeto a partir da representação real de cada animal, ou seja, seus atributos serão nome, tipo animal, idade, habitat, quantidade de patas, quantidadeAssas, envergaduraAssa, altura, peso. Descubram em quais classes abstratas criadas acima esses atributos se encaixam e os criem.
