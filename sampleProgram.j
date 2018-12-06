.class public sampleProgram
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; intx

.field private static x I

; floaty

.field private static y F

; intz

.field private static z I

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method private static fun1()I
	.var 1 is a I
	.var 2 is b I
	.var 3 is c I
	.var 4 is d I
	.var 0 is loc I

; loc=15

	ldc	15
	istore	0

; d=0

	ldc	0
	istore	4
	iload	4
	ireturn
.limit locals 5
.limit stack 8
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

	getstatic     sampleProgram/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
