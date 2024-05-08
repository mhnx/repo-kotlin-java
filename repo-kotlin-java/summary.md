# ```val``` versus ```var```
- **val**: abreviação de valor; usado quando a variável não muda.
- **var**: abreviação de variável; pode mudar ao longo do ciclo de vida da aplicação.
> Usar o ```val``` é encorajado e é considerado uma boa prática. Porém, haverá momentos em que será necessário usar o ```var```, pois alguns frameworks Java não oferecem suporte ao ```val```, como o JPA.

## Pontos positivos da imutabilidade
- Objetos imutáveis são thread-safe;
- Dados imutáveis facilitam o paralelismo;
- Referências à objetos imutáveis podem ser cacheadas;
- Menos peças "soltas", mais fácil de entender.