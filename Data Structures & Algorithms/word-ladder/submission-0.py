from collections import deque

class Solution:
    def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:
        # Create a set from the wordList for faster lookups
        word_set = set(wordList)
        
        # If the endWord is not in the wordList, return 0
        if endWord not in word_set:
            return 0
        
        # Create a queue and add the beginWord to it
        queue = deque([[beginWord, 1]])
        
        # Create a set to keep track of visited words
        visited = {beginWord}
        
        # While the queue is not empty
        while queue:
            word, length = queue.popleft()
            
            # If the current word is the endWord, return the length
            if word == endWord:
                return length
            
            # Try to transform the current word into all other words in the wordList
            for i in range(len(word)):
                for c in 'abcdefghijklmnopqrstuvwxyz':
                    next_word = word[:i] + c + word[i+1:]
                    
                    # If the next_word is in the wordList and we have not visited it before
                    if next_word in word_set and next_word not in visited:
                        # Remove the next_word from the word_set to avoid revisiting it
                        word_set.remove(next_word)
                        
                        # Mark the next_word as visited
                        visited.add(next_word)
                        
                        # Add the next_word to the queue
                        queue.append([next_word, length + 1])
        
        # If we have explored all possibilities without finding the endWord, return 0
        return 0
