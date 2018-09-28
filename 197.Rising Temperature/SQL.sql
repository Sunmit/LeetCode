SELECT w2.Id from Weather w1,Weather w2 where w2.RecordDate= DATE_ADD(w1.RecordDate,interval 1 day)  and w2.Temperature> w1.Temperature;
