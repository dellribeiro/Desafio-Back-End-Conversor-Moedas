package Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class ServicoCotacao {

    static String webService = "https://economia.awesomeapi.com.br/";
    static String path = "last/BRL-USD,BRL-EUR,BRL-GBP,BRL-JPY,BRL-KRW";
    static int codigoSucesso = 200;

    public static Cotacoes obterCotacoes() throws Exception {
        String urlParaChamada = webService + path;


        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = Util.converteJsonEmString(resposta);

            Gson gson = new Gson();
            Type type = new TypeToken<Map<String, Cotacao>>(){}.getType();

            Map<String, Cotacao> cotacoesMap = gson.fromJson(jsonEmString, type);

            Cotacoes cotacoes = new Cotacoes(cotacoesMap);

            return cotacoes;

        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }
}
