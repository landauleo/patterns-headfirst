/**
 * User: Anna Nosova
 * Time: 2019-06-09 17:27
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
/* Вызов метода performQuack(), унаследованного классом MallardDuck;
метод делегирует выполнение операции по ссылке на QuackBehavior
(то есть вызывает quack() через унаследованную переменную quackBehavior).
*/
/*Каждая утка СОДЕРЖИТ экземпляры FlyBehavior и QuackBehavior, которым
делегируются выполнение соответствующих операций.
Подобные связи между двумя классами означают, что вы используете механизм композиции(!!!).
Поведение не наследуется, а предоставляется правильно выбранным объектом.
*/
