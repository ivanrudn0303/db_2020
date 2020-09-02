package homework.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Evgeny Borisov
 */
public class HttpCodeService {
    Pattern regex = Pattern.compile("httpcode:\\s*(\\d{3})");

    public void processHttp(String text) {
        //todo dgasfdjgsafd  httpcode: 404   sjdghfkjdshgafsdah
        int code = parseCode(text);
        for (HttpCode c : HttpCode.values()) {
            if ((c.ordinal() + 1) == (code / 100)) {
                c.result();
            }
        }
    }

    private int parseCode(String text) {
        Matcher matcher = regex.matcher(text);
        if (matcher.find()) {
            return Integer.valueOf(matcher.group(1));
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        HttpCodeService httpCodeService = new HttpCodeService();
        httpCodeService.processHttp("addafhttpcode: 1488das");
    }
}
