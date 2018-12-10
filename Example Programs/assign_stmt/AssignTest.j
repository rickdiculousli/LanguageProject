.class public AssignTest
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; intx

.field private static x I

; inty

.field private static y I

; inttemp

.field private static temp I

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method private static fun()I
	.var 0 is i I
	.var 1 is j I

; i=3

	ldc	3
	istore	0

; j=4

	ldc	4
	istore	1
	ldc	0
	ireturn
.limit locals 2
.limit stack 8
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        AssignTest/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        AssignTest/_standardIn LPascalTextIn;

; x=1

	ldc	1
	putstatic	AssignTest/x I

; y=2

	ldc	2
	putstatic	AssignTest/y I

; temp=fun()

	invokestatic AssignTest/fun()I
	putstatic	AssignTest/temp I

	getstatic     AssignTest/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
