# Баги на странице

 1. Опечатка в логотипе `medium`
 2. Не выделяется значок выбранного способа отображения `low`

 3. Отсутствует переключатель параметра поиска "Сначала из Москвы" `higt`

 4. Фильтрация по полю "Производитель" работает некорректно `higt`

 5. Фильтрация по полю "Память" работает некорректно `higt`

 6. Фильтрация по полю "Цвет" работает некорректно `higt`

 7. Фильтрация по полю "Цена(до)" работает некорректно `higt` 

 8. Результат предварительного поиска на кнопке "Показать Х объявлений" не совпадает с отображаемым в заголовке страницы `medium`

 8. Нет элементов пагинации на странице поиска `higt`

 9. Не отображается блок с авторскими правами и ссылками на соцсети `low` 
 10. Не отображается блок со ссылками на загрузку мобильных приложений `medium`

# Описания багов

### 1. Опечатка в логотипе

    Ожидаемый результат: AVITO

    Фактический: AWITO

### 2. Не выделяется значок выбранного способа отображения

    Шаги воспроизведения:

    - Открыть страницу поиска
    - Нажать на значок с лейблом "Показать большие фото"

    Ожидаемый результат:
    Выбранный значок окрашен черным, остальные - серые

    Фактический результат:
    Все значки черные

### 3. Отсутствует переключатель параметра поиска "Сначала из Москвы"

    Ожидаемый результат: 
    Рядом с параметром "Сначала из Москвы" есть переключатель

    Фактический результат: 
    Переключателя нет

### 4. Фильтрация по полю "Производитель" работает некорректно
    Шаги воспроизведения:
    - Выбрать в поле фильтра "Производитель" наименование Samsung
    - Нажать кнопку "Показать Х объявлений"

    Ожидаемый результат:
    На странице отобразились карточки с товаром производителя Samsung
     
    Фактический результат: 
    Помимо каточек с телефонами Samsung, отобразился телефон другой марки 

### 5. Фильтрация по полю "Память" работает некорректно
    Шаги воспроизведения:
    - Выбрать в разделе фильтра "Память" чек-бокс 512 Гб
    - Нажать кнопку "Показать Х объявлений"

    Ожидаемый результат:
    На странице отобразились карточки с товарами согласно параметру
     
    Фактический результат: 
    В выдаче есть карточки с другими параметрами


### 6. Фильтрация по полю "Цвет" работает некорректно
    Шаги воспроизведения:
    - Выбрать в разделе фильтра "Цвет" чек-бокс с синим цветом
    - Нажать кнопку "Показать Х объявлений"

    Ожидаемый результат:
    На странице отобразились карточки с товарами согласно параметру
     
    Фактический результат: 
    В выдаче есть карточки с другими параметрами

### 7. Фильтрация по полю "Цена(до)" работает некорректно
    Шаги воспроизведения:
    - Вписать в поле фильтра "Цена(до)" цену 50 000
    - Нажать кнопку "Показать Х объявлений"

    Ожидаемый результат:
    На странице отобразились карточки с товарами согласно параметру
     
    Фактический результат: 
    В выдаче есть карточки с другими параметрами

### 8. Результат предварительного поиска на кнопке "Показать Х объявлений" не совпадает с отображаемым в заголовке страницы
    Шаги воспроизведения:
    - Заполнить несколько фильтров, чтобы на кнопке "Показать Х объявлений" изменилось число Х
    - Нажать на кнопку "Показать Х объявлений"

    Ожидаемый результат:
    Рядом с заголовком отразилось число объвлений равное/примерно равное показанному ранее на кнопке "Показать Х объявлений"
     
    Фактический результат: 
    Цифра в заголовке страницы не совпадает с цифрой на кнопке

### 8. Нет элементов пагинации на странице поиска
    Шаги воспроизведения:
    - Настроить фильтры, чтобы количество карточек было больше, чем вмещает одна страница
    - Нажать на кнопку "Показать Х объявлений"

    Ожидаемый результат:
    Внизу страницы есть элементы пагинации

    Фактический результат: 
    Элементы пагинации не отображаются на странице

### 9. Не отображается блок с авторскими правами и ссылками на соцсети
### 10. Не отображается блок со ссылками на загрузку мобильных приложений