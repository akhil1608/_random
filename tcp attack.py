file = open("new2.csv","r")
flags = {}

for line in file:
	l = line.rstrip().split(",")
	if l[6] not in flags:
		flags[l[6]] = 1
	else:
		flags[l[6]] += 1
print(flags)

ack = flags["[A]"]
total = 0
for f in flags:
	total += flags[f]
others = total-ack
threshold = float(input("Enter threshold value (in %): "))

print(ack)
print(others)
print(total)

if abs((ack-others)*100/total)<=threshold:
	print("No attack")
else:
	print("Attack")