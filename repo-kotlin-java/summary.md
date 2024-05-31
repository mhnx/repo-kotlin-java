# ```val``` versus ```var```
- **val**: abreviação de valor; usado quando a variável não muda.
- **var**: abreviação de variável; pode mudar ao longo do ciclo de vida da aplicação.
> Usar o ```val``` é encorajado e é considerado uma boa prática. Porém, haverá momentos em que será necessário usar o ```var```, pois alguns frameworks Java não oferecem suporte ao ```val```, como o JPA.

## Pontos positivos da imutabilidade
- Objetos imutáveis são thread-safe;
- Dados imutáveis facilitam o paralelismo;
- Referências à objetos imutáveis podem ser cacheadas;
- Menos peças "soltas", mais fácil de entender.

# Tipos
Em Kotlin, os tipos das variáveis são os mesmos do Java: int, float, double, short, long, byte, string, boolean.

É importante notar que, diferente do Java, o Kotlin não faz casting implícito, ou seja, para converter o valor de um tipo em outro, é necessário declarar explicitamente no código essa conversão. Veja o exemplo:

```kotlin
val x: Long = 10
val y: Int = x.toInt() // Conversão explícita de Long para Int
```

Sem a chamada do método ```toInt()```, a conversão (casting) não é possível.

# Controle de fluxo
## ```if```
É a maneira mais básica de controle de fluxo em Kotlin.
Em Kotlin, o ```if``` é uma expressão, e não uma instrução como em Java.

Em Java, uma instrução (em inglês, _statement_) é uma linha ou bloco de código que não retorna um valor. Logo, **não pode** estar do lado direito de um sinal de igual (operador de atribuição).

Já uma expressão (em inglês, _expression_), é uma linha ou bloco de código que retorna um valor; logo, **pode** estar no lado direito de um operador de atribuição (```=```).

Por conta dessa característica do Kotlin, o operador ternário não existe em Kotlin. Pois seria redundante.

## ```when```
A expressão ```when``` substitui a expressão ```switch```, expressão clássica das principais linguagems de programação.

A expressão ```when``` possui duas formas: sem argumento e com argumento.

```kotlin
fun main() {

    val pizzasOrdered = 2

    when (pizzasOrdered) {
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> println("Are you sure?")
    }
}
```

## ```while``` e ```for```
Os loops ```while``` e ```do-while``` se comportam exatamente como no Java.

O loop ```for``` é diferente do Java. É mais simples.

## ```fun```
Definir um método ou função em Kotlin é semelhante ao Java. Usamos a palavra reservada ```fun``` e, em seguida, declaramos o nome da função e seus parâmetros entre parênteses.
```kotlin
fun myFunction(n1: Int, n2: Int): Int {
    return n1 + n2
}
```

Quando uma função é curta, é possível simplificar sua escrita usando _expression body_:
```kotlin
fun myExpressionBodyFunction(n1: Int, n2: Int): Int = n1 + n2
```
> Observe que nesse exemplo as chaves (```{``` e ```}```) foram removidas e a palavra reservada ```return``` é substituída pelo sinal de ```=```.
> 
> Além disso, é possível simplificar mais removendo a declaração explícita do tipo de dado retornado pela função visto que o Kotlin é capaz de inferior o tipo baseado no tipo dos parâmetros.

Outra capacidade que o Kotlin possui é a de declararmos valores padrão para quando a função é chamada e os devidos parâmetros não são passados. Isso simplifica a escrita do código em comparação com outras linguagens. No Java, por exemplo, é necessário usar o conceito de _sobrecarga_.

Além disso é possível passar apenas um único argumento, atribuindo o valor desse argumento em uma variável com o mesmo nome da variável contida na declaração da função. O nome desse conceito é ***named argument***.

# Pacotes
Em Kotlin, os pacotes são opcionais. Se for declarado, deve estar contido na primeira linha do arquivo de código. Em casos onde a aplicação é muito simples é possível optar por usar apenas um único pacote (_package_, em inglês), deixando todas as classes em um único arquivo. No entanto, se quisermos que nosso código seja interoperável com Java, é necessário ter pacotes declarados em todos os arquivos e os pacotes devem estar corretos (correspondendo a estrutura de arquivos do projeto).

Além disso, é importante saber que o Kotlin importa alguns pacotes nativos automaticamente. São eles:
- ```kotlin.*``` 
- ```kotlin.annotation.*```
- ```kotlin.collections.*```
- ```kotlin.comparisons.*```
- ```kotlin.io.*```
- ```kotlin.jvm.*```
- ```kotlin.ranges.*```
- ```kotlin.sequences.*```
- ```kotlin.text.*```
- ```java.lang.*```

# POO
Nessa seção vamos aprender as diferentes formas de criar classes em Kotlin; como criar o construtor primário e secundário; objetos; _interfaces_, que têm o mesmo objetivo do Java, servir como um contrato, com algumas diferenças; e, _generics_, que é um pouco mais simples que em Java.

## Classes
Em Kotlin, diferentemente do Java, podemos definir mais de uma classe por arquivo, sem necessidade de ser uma classe aninhada. Por padrão, as classes são públicas. A palavra reservada ```new``` não é necessária. A palavra reservada ```enums``` só tem significado seguido da palavra reservada ```class```. A classe pode ter 1 construtor primário e vários construtores secundários. Para o construtor primário, usamos a palavra reservada ```constructor```, que pode ser omitido se não usamos uma anotação ou um modificador de visibilidade. Além disso, dentro do construtor primário, não podemos ter implementações. Se estivermos usando o construtor primário e queremos que algum código seja executado assim que a classe for instanciada, podemos colocar esse código dentro de um ```init { ... }```.


- Exemplo de classe sem a palavra-chave ```constructor```:
```kotlin
class Person (firstName: String, lastName: String) {

    init {
        println("Created a person named $firstName $lastName.")
    }
}
```

- Exemplo de classe com a palavra-chave ```constructor```, pois há um modificador de visibilidade, o ```internal```:
```kotlin
class Person internal constructor(firstName: String, lastName: String) {

    init {
        println("Created a person named $firstName $lastName.")
    }
}
```

Em alguns cenários, podemos precisar de um construtor secundário, para poder criar instâncias com diferentes números de parâmetros. Nesse caso o construtor secundário precisa chamar o construtor primário por meio da palavra-chave ```this```:

```kotlin
class Person internal constructor(firstName: String, lastName: String) {

    init {
        println("Created a person named $firstName $lastName.")
    }

    constructor(firstName: String, lastName: String, middleName: String):
            this(firstName, lastName)
}
```

## Objetos
Assim como em JavaScript, para criar um objeto não é necessário criar uma classe. Os objetos são entidades. Para declarar um objeto fazemos uso da palavra-chave ```object```:
```kotlin
fun main() {
    val location = object {
        var xCoordinate = 200
        var yCoordinate = 300
    }
}
```

Os objetos também podem ter funções.

Além do uso do tipo ```object``` (_object type_, que é uma expressão), há também a _object declaration_, que é uma instrução. Este não pode ser declarado localmente dentro de uma função, mas pode ser aninhado em outro objeto para criar uma declaração de objeto.

## Interfaces
As _intefaces_ em Kotlin são semelhantes às do Java. Ambas contêm declarações de implementação de métodos, que também são semelhantes às classes abstratas. Mas, diferente das classes abstratas, as _interfaces_ não podem armazenar o estado. Seu objetivo é afirmar qual método deve ser definido por qual usuário da _inteface_ e preferem colocar a sua _interface_ em seu próprio arquivo.

> Lembre-se: qualquer classe que implementar a interface tem que implementar tudo que for definido na interface.

No Kotlin há um comportamento diferente em relação às intefaces. Elas podem ter métodos que serão herdados ao invés de implementados na classe de implementação. Ou seja, qualquer função que tenha corpo será herdada pela classe que implementa a interface.

Para implementar uma interface basta usar o operador ```:```.

## Generics
Generics é uma abordagem que permite criar uma classe ou método de forma que possa ser utilizada com diferentes tipos de dados, mas que são similares entre si.

Os _generics_ em Kotlin são semelhantes a definição em Java. Mas são mais fáceis de trabalhar.

Vamos imaginar que precisamos criar uma função chamada Max e que essa função pega dois parâmetros do mesmo tipo e retorna o maior valor entre os dois. Gostaríamos que essa função funcionasse com todos os tipos de dados, String, Byte, Long, etc.

Para criar uma função genérica observe a abordagem a seguir:

1. Vamos declarar uma função chamada de ```max```:
```kotlin
fun max() {    
}
```

2. Agora vamos declarar os seus parâmetros. No nosso caso, queremos que essa função retorne qual é o maior valor entre dois parâmetros de mesmo tipo. Logo, vamos adicionar os parâmetros com um tipo genérico:
```kotlin
fun max(param1: T, param2: T) : T {    
}
```

Observe que o ```T``` é apenas uma letra para definir que é um tipo genérico. Poderia ser qualquer letra. Por padrão usamos a letra T.

Observe que a função recebe dois parâmetros do tipo T e que a função retorna um valor com o mesmo tipo, no caso, tipo T.

3. Além disso, precisamos avisar à função que ela é genérica. Então adicionamos ```<T>``` após a palavra-chave ```fun```:
```kotlin
fun <T> max(param1: T, param2: T) : T {    
}
```

O ```<T>``` é o parâmetro de tipo que a função vai receber. É um espaço reservado que será substituído em tempo de compilação por um tipo específico.

Até agora declaramos o seguinte: uma função que recebe dois parâmetros também do tipo T e que retorna um tipo T.

Para o nosso exemplo de _generics_, há uma função chamada ```compareTo()``` que retorna 1 quando o primeiro argumento é maior que o segundo. E 0 quando o oposto acontece. Assim, poderíamos declarar o corpo da função assim:
```kotlin
    val result = param1.compareTo(param2)
    return if (result > 0) param1 else param2
```

Porém nem todos os tipos de dados têm a função ```compareTo()```. O tipo String, por exemplo, é um dos tipos que não possuem essa função. Assim, precisamos declarar que o parâmetro de tipo da nossa função implementa a interface ```Comparable```, a fim de que os parâmetros tenham a função ```compareTo()```:

```kotlin
fun <T : Comparable<T>> max(param1: T, param2: T) : T {
    (...)
}
```

Como isso a função vai funcionar como esperado.

# Interoperabilidade com Java

É possível ter classes escritas em Java em um projeto com Kotlin e trabalhar com seus valores de forma simples.

Uma classe com atributo definido como ```private final``` vai ser traduzida como um ```val```. E sem o ```final``` será traduzida como um ```var```.

Também é possível utilizar classes escritas em Kotlin em clases Java. As propriedades do Kotlin são acessadas pelo Java via getters e setters, que são gerados _automagicamente_ pelo compilador Kotlin. Quando estamos no lado Kotlin, não conseguimos acessar os getters e setters, acessamos as propriedades diretamente. Mas quando a classe é usada no Java é possível fazer isso.

Para chamar funções, o compilador vai gerar um método estático daquela função em Kotlin e vai adicionar o sufixo Kt ao final do nome da função.

# Recursos avançados do Kotlin
## Sobrecarga de operadores
Na programação, os operadores são funções que usam nomes simbólicos.

Os operadores binários _overloadable_ são:

| **Operador** | **Nome da função** |
|:------------:|:------------------:|
|  ```x + y``` |        plus        |
|  ```x - y``` |        minus       |
|  ```x * y``` |        times       |
|  ```x / y``` |         div        |
|  ```x % y``` |         mod        |
| ```x .. y``` |       rangeTo      |

Os símbolos de somar e subtrair, por exemplo, chamam as funções ```plus``` e ```minus```, respectivamente.

Nós podemos criar nossas próprias funções para símbolos em nossas classes. Esse é o conceito de **sobrecarga de operadores**.

Os operadores do Kotlin podem ser divididos em 3 grupos:
- operadores binários, um operador no meio de dois operandos (```x + y```, por exemplo). O operador é mapeado internamente para o nome de uma função.
- operadores unários, um operador e um único operando (```!x```, por exemplo).
- demais operadores, atualmente existem mais de 30 operadores que podemos sobrecarregar.


Os operadores unários _overloadable_ são:

| **Operador** | **Nome da função** |
|:------------:|:------------------:|
|```++x, y++```|        inc         |
|```--x, y--```|        dec         |
|   ```+x```   |      unaryPlus     |
|   ```-x```   |      unaryMinus    |
|   ```!x```   |        not         |

Os outros operadores _overloadable_ são:

| **Operador** | **Nome da função** |
|:------------:|:------------------:|
| ```x += y``` |     plusAssign     |
| ```x -= y``` |     minusAssign    |
| ```x *= y``` |     timesAssign    |
| ```x /= y``` |     divAssign      |
| ```x %= y``` |     modAssign      |

## _Annotations_
As _annotations_ são metadados junto ao código. A maneira como usamos _annotations_ em Kotlin é semelhante a Java.

## _Reflections_
As _reflections_ nos permitem acessar informações programáticas dos nossos objetos dinamicamente em runtime. Na verdade, a maioria dos frameworks que usamos no dia a dia costumam usar muito esse recurso.

Pra amenizar o runtime do Kotlin, as APIs de reflexão são mantidas em um arquivo JAR separado. Por isso, para usá-las, precisamos adicionar uma nova dependência ao nosso projeto.

Adicione a dependência no arquivo ```build.gradle.kts```:

```kotlin
dependencies {
    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.6.10")
    (...)
}
```

Esse recurso é avançado. Seu uso é considerado quando precisar especializar alguma coisa, acessar dinamicamente algum valor de um objeto, manipular um objeto, etc.

> **Lembre-se:** Usar o reflection tem um custo. Seu projeto vai empacotar o JAR do Kotlin Reflection e vai deixar o projeto maior por conta da biblioteca extra, e assim como no Java, usar reflection é lento. Use apenas depois que dominar a linguagem, já que é um recurso avançado.

## Desestruturação (_Destructuring_)
A desestruturação é uma maneira de extrairmos apenas as variáveis que queremos de um objeto complexo.

Ao declararmos _data classes_, o Kotlin já inclui mecanismos de desestruturação durante a compilação.

# Programação funcional
## Teoria
A programação funcional foi criada na década de 1950. Mas ainda é nova para muitos desenvolvedores.

Prós:
- Não armazenam estado e os dados são imutáveis, fazendo com que os programas tenham menos bugs

- Fácil reutilização de código

- Multithread seguro

Contras:
- Não há loops, dependendo muito da recursão, o que faz o código ser menos eficiente

- Para programadores acostumados com POO, pode ser dificil resolver problemas utulizando a programação funcional

## Lambdas
Também conhecidas como **funções anônimas**, são funções sem nome definidas dentro de chaves (```{}```) e seus argumentos não estão entre parênteses e a seta (```->```) separa os argumentos do código.