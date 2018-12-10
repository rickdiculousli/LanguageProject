.class public PrintStmt
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inti

.field private static i I

; floatj

.field private static j F

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
	putstatic        PrintStmt/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        PrintStmt/_standardIn LPascalTextIn;

; print("hello world!\n")

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"hello world!\n"
	ldc	0
	anewarray	java/lang/Object
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

; i=23

	ldc	23
	putstatic	PrintStmt/i I

; j=-34.231

	ldc	34.231
	fneg
	putstatic	PrintStmt/j F

; print("integer value: %d, float value: %f\n",i,j)

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"integer value: %d, float value: %f\n"
	ldc	2
	anewarray	java/lang/Object
	dup
	ldc	0
	getstatic	PrintStmt/i I
	invokestatic	java/lang/Integer.valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	ldc	1
	getstatic	PrintStmt/j F
	invokestatic	java/lang/Float.valueOf(F)Ljava/lang/Float;
	aastore
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

	getstatic     PrintStmt/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
