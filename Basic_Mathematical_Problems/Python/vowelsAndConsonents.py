def checkCount(string):
    vowels = 'aeiouAEIOU'
    numOfVowels = 0
    numOfConsonents = 0

    for char in string:
        if char.isalpha():
            if char in vowels:
                numOfVowels += 1
            else:
                numOfConsonents += 1
    return numOfVowels, numOfConsonents


string = input()
vowelsCount, consonentsCount = checkCount(string)
print("vowels", vowelsCount, "consonents", consonentsCount)