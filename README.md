**Task №1**

*Вариант 1 - Работа с массивом*

Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(). Также реализовать сортировку
массива по возрастанию / убыванию любым алгоритмом.

Требования:
Необходимо использовать отдельные функции для подсчета каждого значения и сортировки
Написать перегрузки функций для массива целочисленных и дробных значений
Размер должен вводиться с консоли (смотри класс Scanner и его методы считывания с консоли).
Если он 0 или меньше должно появляться сообщение об ошибке
Пользователь может ввести границы генерации случайных чисел


*Вариант 2 - Консольный калькулятор*

Реализовать простой консольный калькулятор, который может выполнять следующие операции:
Сложение ( + )
Вычитание ( - )
Умножение ( * )
Деление ( / )

Требования:
Программа должна запрашивать у пользователя выражение с двумя операндами и типом
операции (+, -, * , / и т. д.)
Программа должна проверять корректность выражения (проверка в отдельной функции), иначе
попросить повторить ввод
Программа должна проверять корректность ввода данных: если при делении второй операнд
равен нулю, программа должна вывести подробное сообщение об ошибке
Расчет результатов операций должен производиться в отдельных функциях, которые будут
возвращать результат операции (например sum(a, b), divide(a, b) и т.д.)
Перед началом ввода программа должна вывести информацию о поддерживаемых операциях
Поясните работу программы в коде с помощью комментариев
Программа должна работать в цикле, запрашивая операции и числа, пока пользователь не введет
команду "exit" для выхода.

**Task №2**

*Вариант 1 - Калькулятор*
Основываясь на задании после первого занятия, переписать консольный калькулятор с использованием
принципов объектно-ориентированного программирования (ООП). Калькулятор должен поддерживать
основные арифметические операции. Создать отдельный класс калькулятора, а также класс операции, и
его наследников, которые будут представлять конкретную реализацию операции (например Addition
extends Operation и т. д.). Объект калькулятора должен иметь метод по вычислению операции. Класс
операции должен иметь поля - операнды и метод, который возвращает результат операции.

Требования:
Соответствие принципам ООП
Грамотное использование наследования
Инкапсуляция деталей работы с классом калькулятора
Также опционально можно создать отдельный класс, в котором будет содержаться логика
валидации выражения (валидатор).
Консольный интерфейс не должен претерпеть сильных изменений в сравнении с 1 заданием

*Вариант 2 - Вектор*
Создайте класс, который описывает вектор (в трёхмерном пространстве).
У него должны быть:
конструктор с параметрами в виде списка координат x, y, z
метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt()
метод, вычисляющий скалярное произведение
метод, вычисляющий векторное произведение с другим вектором
метод, вычисляющий угол между векторами (или косинус угла)
методы для суммы и разности
статический метод, который принимает целое число N, и возвращает массив случайных векторов
размером N. Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый. То есть,
вектор должен быть неизменяемым (immutable) объектом как String


**Task №3**
Необходимо создать иерархию классов для описания нескольких видов транспорта. В иерархию
должны быть включены как минимум 4 конечных вида транспорта. (например, автомобиль, самолет,
корабль, велосипед и т. д.). Пользователь должен иметь возможность создавать объекты разных видов
транспорта, вызывать методы для каждого объекта и выводить информацию о транспорте на консоль.
В иерархию также могут входить такие сущности, как двигатель, топливо и т. д.
Требования:
Реализовать пользовательский интерфейс на свое усмотрение
Обязательно применение запечатанных (Sealed) классов и перечислений (Enum)
Обязательно корректное применение абстрактных классов или интерфейсов для реализации
иерархии
Создать UML-диаграмму на основе полученной иерархии, на которой будут указаны отношения
между классами (наследование, реализация, ассоциация)
Как решать:
Создать публичный репозиторий на Github / Gitlab / BitBucket
В репозиторий поместить весь код решения
Добавить README с описанием решения и диаграммой (например, в формате png или ссылкой на
draw.io)
Отправить ссылку на репозиторий в текстовом файле