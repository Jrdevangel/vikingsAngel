# vikings-2.0
En este ejercicio tendrás que aplicar los conceptos de programación orientada a objetos y herencia pero esta vez con Java a nuestros amigos vikingos.

## Requisitos

- Se te asignará el repositorio desde classroom.

## Entrega
- Hazte un fork el repositorio a tu entorno local

### Tests, test, tests!

Tener JUnit funcionando


**Ejecuta todos los tests**

Descomenta uno a uno los test y sigue codificando para que pasen los test.

Continua haciendo lo mismo con los ficheros de test de los archivos: `Viking`, `Saxon` y `War`.

## Ejercicio

![](https://depor.com/resizer/v2HfcHPs2nqwFJ8FrZnfdgezmgA=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/ACIIZ7YQGRCZNAIMMM6RWQWB6U.jpg)


--------------------------------------------------------------------------------


### Soldier

Modifica la clase `Soldier`y añade dos métodos `attack()` y `receiveDamage()`.

#### método `constructor()`
- debe recibir **2 argumentos** (health & strength)
- debe recibir la **propiedad `health`** como **1er argumento**
- debe recibir la **propiedad `strength`** como **2nd argumento**

#### método `attack()`
- debe ser una función
- debe recibir **0 arguments**
- debe devolver **la propiedad `strength` del `Soldier`**

#### método `receiveDamage()`

- debe ser una función
- debe recibir **1 argumento** (-*damage*-)
- debe substraer el daño recibido de la propiedad `health`
- **no debe retornar** nada


--------------------------------------------------------------------------------


### Viking

Un `Viking` es un `Soldier` con una propiedad adicional, su nombre (`name`). Además tiene implementado el método `receiveDamage()` de manera distinta y tiene un nuevo método: `battleCry()`.

Modifica el constructor de la clase `Viking` para que herede de la clase `Soldier`, reimplementa el método `receiveDamage()` dentro del `Viking`, y añade el nuevo método `battleCry()`.

#### herencia
- `Viking` debe extender de la clase  `Soldier`

#### `constructor()`
- debe recibir **3 argumentos** (name, health & strength)
- debe recibir la **propiedad `name`** como **1er argumento**
- debe recibir la **propiedad `health`** como **2nd argumento**
- debe recibir la **propiedad `strength`** como **3er argumento**
- debe recibir la **propiedad `msg`** como **4to argumento**

#### método `attack()`

(Se **hereda** de `Soldier`, no necesita reimplementación.)
- debe ser una función
- debe recibir **0 arguments**
- debe devolver **la propiedad `strength` del `Viking`**

#### método `receiveDamage()`

(Este método necesita ser **reimplementado** para `Viking` porque la versión  `Viking` devuelve valores diferentes.)

- debe ser una función
- debe recibir **1 argumento** (-*damage*-)
- debe substraer el daño recibido de la propiedad `health`
- **no debe retornar** nada
- **si el `Viking` todavía está vivo**, debería asignar a msg **"NAME has received DAMAGE points of damage"**
- **si el `Viking` muere**, debería asignar a msg **"NAME has died in act of combat"**

#### método `battleCry()`

[Puedes informarte sobre gritos de guerra, aquí](http://www.artofmanliness.com/2015/06/08/battle-cries/).

- debe ser una función
- debe recibir **0 argumentos**
- debe devolver **"Odin Owns You All!"**


--------------------------------------------------------------------------------


### Saxon

Un `Saxon` es una versión más débil de un `Soldier`. Al contrario de un `Viking`, el `Saxon` no tiene nombre. Su método `receiveDamage()` también es diferente de la versión de `Soldier`.

Modifica el constructor de `Saxon`, hazlo que extienda de `Soldier` y reimplementa el método `receiveDamage()`.

#### herencia
- `Saxon` debe extender de `Soldier`

#### método `constructor()`
- debe recibir **2 argumentos** (health & strength)
- debe recibir la **propiedad `health`** como **1er argumento**
- debe recibir la **propiedad `strength`** como **2nd argumento**
- - debe recibir la **propiedad `msg`** como **3er argumento**
#### método `attack()`
(Este método se **hereda** de `Soldier`, no es necesario reimplementarlo)

- debe ser una función
- debe recibir **0 arguments**
- debe devolver **la propiedad `strength` del `Soldier`**


#### `receiveDamage()` method


- should be a function
- should receive **1 argument** (the damage)
- should remove the received damage from the `health` property

#### método `receiveDamage()`

(Este método necesita ser **reimplementado** porque la versión `Saxon` necesita devolver valores diferentes.)

- debe ser una función
- debe recibir **1 argumento** (-*damage*-)
- debe substraer el daño recibido de la propiedad `health`
- **si el Saxon está todavía vivo**, debería asignar a msg _**"A Saxon has received DAMAGE points of damage"**_
- **si el Saxon muere**, debería asignar a msg _**"A Saxon has died in combat"**_

--------------------------------------------------------------------------------


### (BONUS) War

Ahora vamos al lío: la GUERRA. la clase `War` debe servir para montar una batalla entre el ejército de `Viking` y el ejército de `Saxon`.

Modifica la clase `War` y añade estos 5 métodos:
- `addViking()`
- `addSaxon()`
- `vikingAttack()`
- `saxonAttack()`
- `showStatus()`

#### el método `constructor()`

Cuando se cree `War`, los ejércitos (*armies*) deben estar vacíos. Los soldados se añadirán a los ejercitos con posterioridad

- debe recibir **0 argumentos**
- debe asignar un array (List) vacío a la **propiedad `vikingArmy`**
- debe asignar un array (List) vacío a la **propiedad `saxonArmy`**

#### método `addViking()`

Añade 1 `Viking` al `vikingArmy`. Si quieres un ejercito de 10 `Viking`, necesitarás llamar al método 10 veces.

- debe ser una función
- debe recibir **1 argumento** (un objeto `Viking`)
- debe añadir el `Viking` recibido al ejército
- **no devuelve nada**

#### el método `addSaxon()`

Es la versión `Saxon` de `addViking()`.

- debe ser una función
- debe recibir **1 argumento** (un objeto `Saxon`)
- debe añadir el `Saxon` recibido al ejército
- **no devuelve nada**

#### el método `vikingAttack()`

Se invoca el método `receiveDamage()` del `Saxon` (elegido al azar) con un daño igual a la `strength` de un `Viking` (también elegido al azar). Sólo debe realizar un ataque y el `Saxon` no debe contraatacar.

- debe ser una función
- debe recibir **0 argumentos**
- debe hacer que `receiveDamage()` de `Saxon` sea igual a `strength` de un `Viking`
- debe eliminar los saxones muertos del ejército.
- debe retornar el **resultado de llamar a `receiveDamage()` de `Saxon`** con `strength` de `Viking`

#### el método `saxonAttack()`

La version `Saxon` de `vikingAttack()`. Un `Viking` recibe daño igual a  `strength` de un `Saxon`.

- debe ser una función
- debe recibir **0 argumentos**
- debe hacer que `receiveDamage()` de `Viking` sea igual a `strength` de un `Saxon`
- debe eliminar los vikingos muertos del ejército.
- debe retornar el **resultado de llamar a `receiveDamage()` de `Viking`** con `strength` de `Saxon`


#### método `showStatus()`

Devuelve el estado actual de la guerra (`War`) basado en el tamaño de los ejércitos.

- debe ser una función
- debe recibir **0 arguments**
- **Si el array de `Saxon` está vacío**, devolverá _**"Vikings have won the war of the century!"**_
- **Si el array de `Viking` está vacío**, devolverá _**"Saxons have fought for their lives and survive another day..."**_
- **Si hay al menos 1 `Viking` y 1 `Saxon`**, devolverá _**"Vikings and Saxons are still in the thick of battle."**_


--------------------------------------------------------------------------------


💪
# vikings-2.0
# vikings-2.0
# vikings-2.0
# vikins-2.0
# vikings-2.0
# vikins-2.0
