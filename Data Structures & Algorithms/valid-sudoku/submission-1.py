class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        row = [set() for _ in range(9)]
        column = [set() for _ in range(9)]
        sub_box = [set() for _ in range(9)]
        dict_range = {}
        for r_idx,r in enumerate(board):
            for e_idx, element in enumerate(r):
                subSquare = self.assignValue(r_idx,e_idx)
                if element == ".":
                    continue
                else:
                    if element in row[r_idx]:
                        return False
                    else:
                        row[r_idx].add(element)
                    if element in column[e_idx]:
                        return False
                    else: 
                        column[e_idx].add(element)
                    if subSquare == -1 or element in sub_box[subSquare]:
                        return False
                    else:     
                        sub_box[subSquare].add(element)     
        return True
    
    def assignValue(self, x, y):
        if 0<= x <= 2 and 0<= y <= 2:
            return 0
        elif 3<= x <= 5 and 0<= y <= 2:
            return 1
        elif 6<= x <= 8 and 0<= y <= 2:
            return 2
        elif 0<= x <= 2 and 3<= y <= 5:
            return 3 
        elif 3<= x <= 5 and 3<= y <= 5:
            return 4
        elif 6<= x <= 8 and 3<= y <= 5:
            return 5
        elif 0<= x <= 2 and 6<= y <= 8:
            return 6
        elif 3<= x <= 5 and 6<= y <= 8:
            return 7
        elif 6<= x <= 8 and 6<= y <= 8:
            return 8
        else:
             return -1
                

                

        

# sector 1 - (0-2,0-2)
# sector 2 - (4-6, )
# so, need to be iterate across, and then check if new column violates previous. Iterate across horizontally once, then again vertically. or do it once, (move across, and then store the position dpending on the data structure in a hash map )
# basically, each sub group will be 9/3.
#can keep row and column seperate, if there is a duplicate in a row, it has no impact on the column. 
# so 3 structures. one to keep track of each 3x3 board, one for each row, and one for each column
# HashMap with <Int,Int> structure
# 3 structures, list of sets instead.
#[["1","2",".",".","3",".",".",".","."],
#  ["4",".",".","5",".",".",".",".","."],
#  [".","9","8",".",".",".",".",".","3"],
#  ["5",".",".",".","6",".",".",".","4"],
#  [".",".",".","8",".","3",".",".","5"],
#  ["7",".",".",".","2",".",".",".","6"],
#  [".",".",".",".",".",".","2",".","."],
#  [".",".",".","4","1","9",".",".","8"],
#  [".",".",".",".","8",".",".","7","9"]]


