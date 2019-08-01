package wang.ismy.gateway;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


@Component
public class MyFallback implements FallbackProvider {
    @Override
    public String getRoute() {
        return "producer";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {

        cause.printStackTrace();


        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.valueOf(500);
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return 500;
            }

            @Override
            public String getStatusText() throws IOException {
                return "SERVER ERROR";
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream("service is unavailable".getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.TEXT_PLAIN);
                return headers;
            }
        };
    }
}
