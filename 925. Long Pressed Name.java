class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
    if (name.charAt(0) != typed.charAt(0)) {
        return false;
    }

    for (int j = 0; j < typed.length(); j++) {
        if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
            i++;
        } else if (typed.charAt(j) != typed.charAt(j - 1)) {
            return false;
        }
    }
    return i == name.length();
    }
}
