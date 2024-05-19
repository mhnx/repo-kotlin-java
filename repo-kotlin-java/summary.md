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

## Pacotes
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