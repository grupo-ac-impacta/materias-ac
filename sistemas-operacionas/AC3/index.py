# CIÊNCIAS DA COMPUTAÇÃO - SISTEMAS OPERACIONAS - AC_03

# INTEGRANTES

# Leandro Damasceno de Lima | RA: 1902792
# Luiz Henrique de Oliveira Contri | RA: 1903312
# Danyllo Henrique Verri Santana | RA: 1601298
# Matheus Nascimento Rodrigues | RA: 1902805

from random import randint
from threading import *
from time import sleep

EMPTY_FIELD = '#'
control = Semaphore() 

class HashGame():

    def __init__(self):
        self.board = [
            [EMPTY_FIELD, EMPTY_FIELD, EMPTY_FIELD], 
            [EMPTY_FIELD, EMPTY_FIELD, EMPTY_FIELD], 
            [EMPTY_FIELD, EMPTY_FIELD, EMPTY_FIELD]
        ]

    def showBoard(self):
        board = ""

        for l in self.board:
            board += "\n"
            for c in l:
                board += c

        board += "\n"
        print(board)

    def generateRandomCoordinates(self):
        coods = {"lin": randint(0, 2), "col": randint(0, 2)}
        return coods 

    def getRandomEmptyPosition(self):
        global EMPTY_FIELD
        newPosition = {}

        while True:
            newPosition = self.generateRandomCoordinates()

            if self.board[newPosition['lin']][newPosition['col']] == EMPTY_FIELD:
                break
        
        return newPosition

    def status(self):
        patterns = [
            # COLUNAS
            [[0, 0], [1, 0], [2, 0]], [[0, 1], [1, 1],
                                       [2, 1]], [[0, 2], [1, 2], [2, 2]],

            # LINHAS
            [[0, 0], [0, 1], [0, 2]], [[1, 0], [1, 1],
                                       [1, 2]], [[2, 0], [2, 1], [2, 2]],

            # DIAGONAIS
            [[0, 0], [1, 1], [2, 2]], [[2, 0], [1, 1], [0, 2]]
        ]

        winner = 0

        # Checar se houve ganhador
        for pattern in patterns:
            p1 = self.board[pattern[0][0]][pattern[0][1]]
            p2 = self.board[pattern[1][0]][pattern[1][1]]
            p3 = self.board[pattern[2][0]][pattern[2][1]]

            if (p1 == p2 and p1 == p3 and p1 == 'O' and winner == 0):
                winner = 1
            if (p1 == p2 and p1 == p3 and p1 == 'X' and winner == 0):
                winner = 2

        if winner != 0:
            return winner

        # Checar se houve empate
        occupiedPositions = 0
        for l in self.board:
            for c in l:
                if c != EMPTY_FIELD:
                    occupiedPositions += 1

        if occupiedPositions == 9: 
            return 0 

        return -1
    
    def markPosition(self, player):
        position = self.getRandomEmptyPosition()

        self.board[position['lin']][position['col']] = player
        self.showBoard()
        
        print("Último jogador: ", player, " | PosX: ", position['lin'], " - PosY: ", position['col'])

hashGame = HashGame()
currentPlayer = 'X'

# Jogador
def player(player):
    global currentPlayer

    while True:
        # Sincronizar a ordem de jogada (evita que um mesmo jogador jogue repetidamente)
        if currentPlayer != player:
            while currentPlayer != player:
                sleep(0.200)

        control.acquire() # Bloquear a zona de risco

        hashGame.markPosition(player)
        status = hashGame.status()
        
        if status >= 0:
            break

        currentPlayer = 'O' if player == 'X' else 'X' 
        control.release() #Liberar a zona de risco
    
    if status == 0:
        print("Houve um empate!")

    if status == 1:
        print("Jogador 'O' ganhou!")

    if status == 2:
        print("Jogador 'X' ganhou!")
        
# Criando as threads
playerX = Thread(target = player, args = ('X',))
playerO = Thread(target = player, args = ('O',))

# Iniciando as threads
playerX.start()
playerO.start()