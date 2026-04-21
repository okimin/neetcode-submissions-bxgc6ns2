class Solution:
    def isPalindrome(self, s: str) -> bool:
        trimmed = ""
        for c in s:
            if c.isalnum():
                trimmed += c.lower()
        return trimmed == trimmed[::-1]
            