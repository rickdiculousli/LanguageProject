.class public sampleProgram
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; intx

.field private static x I

; floaty

.field private static y F

; floatwow

.field private static wow F

; boolval

.field private static val I

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

; x=20

	ldc	20
	putstatic	sampleProgram/x I

; y=10.2

	ldc	10.2
	putstatic	sampleProgram/y F

; print("I like number int: %i ,float: %f",x,y)

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"I like number int: %i ,float: %f"
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
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)V

; wow=0

	ldc	0
	putstatic	sampleProgram/wow I

; while(wow<10.0){wow=wow+2.2;}

L000:
	getstatic	sampleProgram/wow F
	ldc	10.0
	fcmpl
	iflt	L002
	iconst_0
	goto	L003
L002:
	iconst_1
L003:
	ifeq	L001

; wow=wow+2.2

	getstatic	sampleProgram/wow F
	ldc	2.2
	fadd
	putstatic	sampleProgram/wow F
	goto	L000
L001:

; val=false

	iconst_0
	putstatic	sampleProgram/val I

; if(wow>y){val=true;}else{x=(5-2)*6-x;}

	getstatic	sampleProgram/wow F
	getstatic	sampleProgram/y F
	fcmpl
	ifgt	L006
	iconst_0
	goto	L007
L006:
	iconst_1
L007:
	ifeq	L005

; val=true

	iconst_1
	putstatic	sampleProgram/val I
	goto	L004
L005:

; x=(5-2)*6-x

	ldc	5
	ldc	2
	isub
	ldc	6
	imul
	getstatic	sampleProgram/x I
	isub
	putstatic	sampleProgram/x I
L004:

	getstatic     sampleProgram/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
