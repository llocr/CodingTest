class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^0-9a-z-_.]", "");
        new_id = new_id.replaceAll("\\.{2,}", ".");
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        new_id = new_id.equals("") ? "a" : new_id;
        new_id = new_id.length() >= 16 ? new_id.substring(0, 15) : new_id;
        new_id = new_id.replaceAll("[.]$", "");
        
        char last = new_id.charAt(new_id.length() -1);
        if(new_id.length() <= 2) {
            while (new_id.length() < 3) {
                new_id += last;
            }
        }
        
        return new_id;
    }
}