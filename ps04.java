//Write a function to find the longest common prefix string amongst an array of strings.

class ps04 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Tomamos la primera palabra como punto de referencia
        String prefijoComun = strs[0];

        // Iteramos a través de las letras de la primera palabra
        for (int i = 0; i < prefijoComun.length(); i++) {
            char letra = prefijoComun.charAt(i);

            // Iteramos a través de las demás palabras
            for (String palabra : strs) {
                if (i >= palabra.length() || palabra.charAt(i) != letra) {
                    // Si encontramos una letra diferente o llegamos al final de una palabra, terminamos
                    return prefijoComun.substring(0, i);
                }
            }
        }

        return prefijoComun;
    }
}
