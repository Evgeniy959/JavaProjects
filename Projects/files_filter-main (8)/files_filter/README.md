#  Утилита фильтрации содержимого файлов
### Описание
При запуске утилиты в командной строке подается несколько файлов, содержащих целые числа,
вещественные числа и строки. В качестве разделителя используется перевод строки.
Строки из файлов читаются по очереди в соответствии с их перечислением в командной строке.\
Задача утилиты записать разные типы данных в разные файлы. Целые числа в один
выходной файл, вещественные в другой, строки в третий. По умолчанию файлы с
результатами располагаются в текущей папке с именами integers.txt, floats.txt, strings.txt.
Файлы с результатами создаются по мере необходимости. Если какого-то типа данных во входящих
файлах нет, то и соответствующий файл не создается.\
Дополнительно с помощью опции -o можно задавать путь для результатов. Опция -p
задает префикс имен выходных файлов. Например -o /some/path -p result_ задают вывод в
файлы /some/path/result_integers.txt и тд.
По умолчанию файлы результатов перезаписываются. С помощью опции -a можно задать
режим добавления в существующие файлы.\
В процессе фильтрации данных собирается статистика по каждому типу данных.
Статистика поддерживается двух видов: краткая и полная.
Выбор статистики производится опциями -s и -f соответственно. Краткая статистика содержит
только количество элементов записанных в исходящие файлы. Полная статистика для чисел
дополнительно содержит сумму, среднее, минимальное и максимальное значение.
Полная статистика для строк, помимо их количества, содержит также размер самой
короткой и самой длинной строки.
Статистика по каждому типу отфильтрованных данных выводится в консоль.
### Особенности реализации
Программа реализована на Java 11\
Пустые строки игнорируются.\
Все числа распознаются только в десятичной системе счисления.\
Целые числа в диапазоне -9223372036854775808..9223372036854775807 (long). Вне этого диапазона 
число считается вещественным (double), с потерей точности после 16го знака. Так же вещественными числами
считаются запись через точку и экспоненциальная запись (научная нотация). Вещественное число,
которое не может нормально храниться в переменной типа double считается строкой.\
### Запуск
Можно запустить jar-файл с помощью команды:
java -jar FilesFilter.jar [options] [files...]