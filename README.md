# Spring-Mockito
Задание

Создайте небольшое приложение,
в котором будут созданы Класс User с обязательным полем name (другие поля по желанию),а также слои Dao и Service.

В классе UserDaoImpl создайте лист юзеров и в конструкторе наполните его несколькими объектами класса User.

Также в этом классе нужно реализовать 2 метода getUserByName ,
который будет принимать имя и возвращать юзера по этому имени или null в противном случае и метод findAllUsers ,
который будет возвращать список юзеров.

В классе UserService нужно реализовать один метод checkUserExist ,
который принимает юзера и, обращаясь к дао, будет искать юзера в списке и возвращать возвращать true или false,
в зависимости от результата.

Теперь нам нужно создать два класса для тестирования.

Первый класс UserDaoTest будет без применения Mockito.

В этом классе тестируем метод getUserByName из класса UserDaoImpl . 

Сначала нужно задать нового юзера с существующем именем из нашего списка и убедиться, что метод вернет true.

Вторым тестовым методом будет обратная проверка на то, что метод вернет null,
если мы зададим пользователя с именем, не существующем в списке.

Вторым классом для тестирования будет класс UserServiceTest ,
в котором нам необходимо протестировать метод checkUserExist из класса UserService .

Протестировать его нужно дважды:

На возврат true и false при передачи ему разных значений.

Значения устанавливаем с помощью функционала Mockito.
То есть наша задача "замокать" обращение класса UserService к классу UserDaoImpl .
