
# test-masivian
Prueba técnica para masivian

## Problemas Identificados y Soluciones:

1. La principal "mala práctica" es darle la responsabilidad de varias funcionalidades
    a una única clase, lo cuál produce mayor dificultad de darle mantenimiento y realizar
    cambios.
2. Tener un código acoplado dificulta o hasta imposibilita la opción de poder crear
    set de pruebas unitarias, obligando a hacer sólo pruebas de integración.
3. Existen muchos ciclos anidados que acoplan el código, por ello se procede a separarlos
    en diferentes métodos y clases.
4. Para romper el acoplamiento de las clases se implementaron interfaces, aceptando
    cualquier objeto que implemente la interfaz.
5. Definir las variables como propiedades de la clase a la que correspondan, y asignar
    valores por defecto en su declaración.
6. Los archivos creados fueron PrinterRefactor.java, Page.java, PageInterface.java, 
    Margin.java, Dimension.java, JPrime.java, Mult.java, log_run.txt 
    (Log del programa ejecutado).
7. Redefinir nombre de variables para mayor entendimiento de su funcionalidad.

Elaborado por: Ing. Pedag. Henry Giovanny Gonzalez Waltero
04/05/2020
