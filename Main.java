package geekbrains;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Main {

    public static void main(String[] args) throws Exception {

        String result = "";
        HttpGet get = new HttpGet("http://dataservice.accuweather.com/forecasts/v1/daily/5day/2206565"
        + "?apikey=4kLEHve4i2NDl9nx977kd5fxiKwwWwlF");

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
            CloseableHttpResponse response = httpClient.execute(get)){
            result = EntityUtils.toString(response.getEntity());
        }

        System.out.println(result);
    }
}
