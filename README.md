Цель проекта Fedor: Получение курсов ЦБ по указанной валюте за текущею дату или за указанную дату.

Формат и перечень возможных валют:
AUD, AZN, GBP, AMD, BYN, BGN, BRL, HUF, HKD, DKK, USD, EUR, INR, KZT, CAD, KGS, CNY, 
MDL, NOK, PLN, RON, XDR, SGD, TJS, TRY, TMT, UZS, UAH, CZK, SEK, CHF, ZAR, KRW, JPY

Формат даты: ДД/ММ/ГГГГ

Описание API:
http://localhost:8080/swagger-ui.html#!/Currency/getCursUsingGET

Пример запроса на получение курса по указанной валюте и текущей дате:
http://localhost:8080/api/valcurs/get/USD

Пример запроса на получение курса по указанной валюте и указанной дате:
http://localhost:8080/api/valcurs/get/USD?date=10/06/2022

