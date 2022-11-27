import java.util.HashMap;

/**
 * Implementa un parser de las opciones pasadas como argumentos
 * por la linea de comandos.
 * CLI sencillo para parámetros con un valor
 * Para la implementación utiliza un HashMap
 */
public class OptionsParser {
    private final HashMap<String, Boolean> hOptions = new HashMap<>();
    private String[] args;

    private OptionsParser() {}
    public OptionsParser(String[] args) {
        this.args = args;
    }

    public void registerOption(String sOptionName) {
        hOptions.put(sOptionName, false);
    }

    public boolean getOption(String sOptionName) {
        return hOptions.get(sOptionName);
    }

    public void setOptionValue(String sOptionName, boolean bOptionValue) {
        hOptions.replace(sOptionName, bOptionValue);
    }

    public void parse() {
        for (String arg : args) {
            String sOptionName = arg.replace("-", "");
            if (hOptions.containsKey(sOptionName)) {
                setOptionValue(sOptionName, true);
            }
        }
    }
    public boolean noArgs() {
        return (hOptions.size() == 0);
    }
}
