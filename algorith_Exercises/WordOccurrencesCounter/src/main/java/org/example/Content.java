package org.example;

public class Content {
    private String paragraph;
    public Content(String p){
        paragraph = p;
    }
    public int getCount(String word){
        String trimmed=paragraph.trim();
        int count = 0,wl = word.length();
        int tl =trimmed.length();
        if (tl < wl ){
            return 0;
        }
        if (tl == wl
                && trimmed.substring(0, wl).equals(word)
        ) {
            return 1;
        }
        if (trimmed.substring(0,wl).equals(word)){
            count++;
        }
        if ((trimmed.substring(tl-wl)).equals(word)
                && trimmed.charAt(tl -wl -1)==' '){
            count++;
        }

        for (int i =wl; i < tl -wl; i++){
            if ((trimmed.substring(i,i + wl)).equals(word)
            && trimmed.charAt(i+wl)==' '
            && trimmed.charAt(i-1)==' ')
                count++;
        }
        return count;
    }
}
