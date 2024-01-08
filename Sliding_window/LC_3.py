def lengthOfLongestSubstring(s: str) -> int:
        L = 0
        R = 0
        longest = 0
        map = {}
        while(R < len(s)):
            while(R<len(s) and s[R] not in map):
                  map[s[R]] = 0
                  if(R<len(s)):
                        R += 1
            longest = max(longest, R-L)
            if(L < R):
                map.pop(s[L])
                L +=1
        return longest
                  
                  
            
            
print(lengthOfLongestSubstring("pwwkew"))