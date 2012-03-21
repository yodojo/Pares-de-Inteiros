Problema "Pares de Inteiros"

Você deve encontrar todos os pares de inteiros cuja soma seja igual ao inteiro N passado na entrada, e o segundo número desse par deve ser resultado da retirada de um dos digitos do primeiro número desse par. O primeiro deve ter sempre dois digitos e começar com um digito diferente de zero. O segundo deve ter um digito a menos que o primeiro, e este pode começar com zero.

Entrada

A primeira linha de entrada deve ser um número inteiro t ( 1 <= t <= 20 ), que será o número de casos. Cada linha após t, é o número a serem calculados os pares conforme a regra. Esses números devem ser inteiros N (10 <= N <= 10^9).

saída

Para cada caso:

Escrever na primeira linha o número de pares de inteiros que satisfazem o problema. Em seguida as linhas devem conter os pares em ordem crescente em relação ao primeiro número do par, no seguinte formato

X + Y = N

Por exemplo:

Entrada:
2
302
11

Saída:
5
251 + 51 = 302
275 + 27 = 302
276 + 26 = 302
281 + 21 = 302
301 + 01 = 302
1
10 + 1 = 11


