package org.example;

import io.confluent.ksql.function.udf.Udf;
import io.confluent.ksql.function.udf.UdfDescription;


@UdfDescription(
        name = "plus_1000",
        description = "TEST UDF : PLUS 1000",
        version = "0.0.0",
        author = "ME")
public class PlusThouUdf {

    private Integer plusThousand(int input) {
        return input + 1000;
    }

    @Udf(description = "Plus 1000")
    public Integer apply(int source) {
        return plusThousand(source);
    }

    @Udf(description = "Plus 1000 with String. return type is Integer")
    public Integer apply(String source) {
        Integer integer = Integer.valueOf(source);
        return plusThousand(integer);
    }


}
