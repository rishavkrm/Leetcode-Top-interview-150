def minWindow(s: str, t: str) -> str:
        def check(map1, map2):
            for i in map1:
                if(i not in map2 or map1[i] > map2[i]):return False
            return True
        l = 0
        r = 0
        min = len(s)*2
        map1 = {}
        for c in t:
            if c in map1:map1[c] += 1
            else: map1[c] = 1
        map2 = {}
        res = ""
        while(r<len(s)):
            while(not check(map1,map2) and r<len(s)):
                if s[r] in map2: map2[s[r]]+= 1
                else: map2[s[r]] = 1
                if(r<len(s)):
                    r += 1
            while(check(map1, map2) and l < r):
                if(r-l < min):
                    min = r-l
                    res = s[l:r]
                map2[s[l]] -= 1
                l += 1
                
        return res
s = "ADOBECODEBANC"
t = "ABC"
print(minWindow(s,t))