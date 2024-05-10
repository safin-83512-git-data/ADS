public boolean isPalindrome(String str) {
    char[] charArray = str.toCharArray();
    int left = 0;
    int right = charArray.length - 1;
    
    while (left < right) {
        if (charArray[left] != charArray[right])
            return false;
        left++;
        right--;
    }
    return true;
}

