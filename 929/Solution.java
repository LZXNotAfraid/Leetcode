class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<String>();
        for(int i = 0 ; i < emails.length ; i ++){
            String[] temp = emails[i].split("@");
            set.add(temp[0].replace(".", "").split("\\+")[0] + "@" + temp[1]);
            //System.out.println(temp[0].replace(".", "").split("/+")[0] + "@" + temp[1]);
        }
        return set.size();
    }
}
