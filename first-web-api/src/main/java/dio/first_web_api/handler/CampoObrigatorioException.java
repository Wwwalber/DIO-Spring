package dio.first_web_api.handler;

public class CampoObrigatorioException extends BusinessException {

    public CampoObrigatorioException(String campo) {
        super("O campo %s é obrigatorio!", campo);
    }

}
