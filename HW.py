import random
import pandas as pd

lst = ['robot'] * 10
lst += ['human'] * 10
is_robot = []
is_human = []

random.shuffle(lst)

for el in lst:
    if el == 'robot':
        is_robot.append(True)
        is_human.append(False)
    else:
        is_robot.append(False)
        is_human.append(True)

data = pd.DataFrame({'robot': is_robot,'human': is_human})
print(data.head())