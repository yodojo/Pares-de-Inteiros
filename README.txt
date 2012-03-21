Problema "Pares de Inteiros"

Voc� deve encontrar todos os pares de inteiros cuja soma seja igual ao inteiro N passado na entrada, e o segundo n�mero desse par deve ser resultado da retirada de um dos digitos do primeiro n�mero desse par. O primeiro deve ter sempre dois digitos e come�ar com um digito diferente de zero. O segundo deve ter um digito a menos que o primeiro, e este pode come�ar com zero.

Entrada

A primeira linha de entrada deve ser um n�mero inteiro t ( 1 <= t <= 20 ), que ser� o n�mero de casos. Cada linha ap�s t, � o n�mero a serem calculados os pares conforme a regra. Esses n�meros devem ser inteiros N (10 <= N <= 10^9).

sa�da

Para cada caso:

Escrever na primeira linha o n�mero de pares de inteiros que satisfazem o problema. Em seguida as linhas devem conter os pares em ordem crescente em rela��o ao primeiro n�mero do par, no seguinte formato

X + Y = N

Por exemplo:

Entrada:
2
302
11

Sa�da:
5
251 + 51 = 302
275 + 27 = 302
276 + 26 = 302
281 + 21 = 302
301 + 01 = 302
1
10 + 1 = 11


