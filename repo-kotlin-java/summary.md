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