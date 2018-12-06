.class public sampleProgram
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; intx

.field private static x I

; floaty

.field private static y F

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        sampleProgram/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        sampleProgram/_standardIn LPascalTextIn;

; print("program begin\n")

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"program begin\n"
	ldc	0
	anewarray	java/lang/Object
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

; x=20

	ldc	20
	putstatic	sampleProgram/x I

; y=10.2

	ldc	10.2
	putstatic	sampleProgram/y F

; print("Just a normal string\n")

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"Just a normal string\n"
	ldc	0
	anewarray	java/lang/Object
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

; print("Initialized 2 numbers int: %d ,float: %f\n",x,y)

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"Initialized 2 numbers int: %d ,float: %f\n"
	ldc	2
	anewarray	java/lang/Object
	dup
	ldc	0
	getstatic	sampleProgram/x I
	invokestatic	java/lang/Integer.valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	ldc	1
	getstatic	sampleProgram/y F
	invokestatic	java/lang/Float.valueOf(F)Ljava/lang/Float;
	aastore
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

; x=x-2

	getstatic	sampleProgram/x I
	ldc	2
	isub
	putstatic	sampleProgram/x I

; print("int minus 2: %d\n",x)

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"int minus 2: %d\n"
	ldc	1
	anewarray	java/lang/Object
	dup
	ldc	0
	getstatic	sampleProgram/x I
	invokestatic	java/lang/Integer.valueOf(I)Ljava/lang/Integer;
	aastore
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

; print("if float less or equal to 10.2\n")

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"if float less or equal to 10.2\n"
	ldc	0
	anewarray	java/lang/Object
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

; if(y>=20.0){print("Inside then statement: TRUE\n");}else{print("Inside else statement: FALSE\n");}

	getstatic	sampleProgram/y F
	ldc	20.0
	fcmpl
	ifge	L002
	iconst_0
	goto	L003
L002:
	iconst_1
L003:
	ifeq	L001

; print("Inside then statement: TRUE\n")

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"Inside then statement: TRUE\n"
	ldc	0
	anewarray	java/lang/Object
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop
	goto	L000
L001:

; print("Inside else statement: FALSE\n")

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"Inside else statement: FALSE\n"
	ldc	0
	anewarray	java/lang/Object
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop
L000:

; y=y*2.0

	getstatic	sampleProgram/y F
	ldc	2.0
	fmul
	putstatic	sampleProgram/y F

; print("float times 2: %f\n",y)

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"float times 2: %f\n"
	ldc	1
	anewarray	java/lang/Object
	dup
	ldc	0
	getstatic	sampleProgram/y F
	invokestatic	java/lang/Float.valueOf(F)Ljava/lang/Float;
	aastore
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

; print("while int is larger than 0\n")

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"while int is larger than 0\n"
	ldc	0
	anewarray	java/lang/Object
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

; while(x>0){print("int iterate down by 2: %d\n",x);x=x-2;}

L004:
	getstatic	sampleProgram/x I
	ldc	0
	if_icmpgt	L006
	iconst_0
	goto	L007
L006:
	iconst_1
L007:
	ifeq	L005

; print("int iterate down by 2: %d\n",x)

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"int iterate down by 2: %d\n"
	ldc	1
	anewarray	java/lang/Object
	dup
	ldc	0
	getstatic	sampleProgram/x I
	invokestatic	java/lang/Integer.valueOf(I)Ljava/lang/Integer;
	aastore
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

; x=x-2

	getstatic	sampleProgram/x I
	ldc	2
	isub
	putstatic	sampleProgram/x I
	goto	L004
L005:

; print("program complete!")

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"program complete!"
	ldc	0
	anewarray	java/lang/Object
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

	getstatic     sampleProgram/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
