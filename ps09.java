//2 solutions, first one ez, second one is a bit more complicated.
public class ps09 {
        public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
    return -1;
    }

        public int strStr2(String haystack, String needle) {
            // Si needle es una cadena vacía, devolvemos 0.
            if (needle.isEmpty()) {
                return 0;
            }
    
            int hayLen = haystack.length();
            int needLen = needle.length();
    
            for (int i = 0; i <= hayLen - needLen; i++) {
                int j;
                // Comparamos las subcadenas de needle y haystack de longitud needLen.
                for (j = 0; j < needLen; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }
                // Si encontramos una coincidencia completa, devolvemos la posición.
                if (j == needLen) {
                    return i;
                }
            }
    
            // Si no se encuentra ninguna coincidencia, devolvemos -1.
            return -1;
        }
    }
    

