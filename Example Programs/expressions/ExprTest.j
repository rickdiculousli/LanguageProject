.class public ExprTest
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inti

.field private static i I

; floatf

.field private static f F

; boolb

.field private static b I

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
	putstatic        ExprTest/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        ExprTest/_standardIn LPascalTextIn;

; x=-1

	ldc	1
	ineg
	putstatic	ExprTest/x I

; x=1+2-3

	ldc	1
	ldc	2
	iadd
	ldc	3
	isub
	putstatic	ExprTest/x I

; x=-2*3

	ldc	2
	ineg
	ldc	3
	imul
	putstatic	ExprTest/x I

; x=(1+2)*3

	ldc	1
	ldc	2
	iadd
	ldc	3
	imul
	putstatic	ExprTest/x I

; y=-3.9

	ldc	3.9
	fneg
	putstatic	ExprTest/y F

; y=2.1+1.7-4.5

	ldc	2.1
	ldc	1.7
	fadd
	ldc	4.5
	fsub
	putstatic	ExprTest/y F

; y=2.3*4.5

	ldc	2.3
	ldc	4.5
	fmul
	putstatic	ExprTest/y F

; y=(1.2-3.4)*5.6

	ldc	1.2
	ldc	3.4
	fsub
	ldc	5.6
	fmul
	putstatic	ExprTest/y F

; b=true

	iconst_1
	putstatic	ExprTest/b I

; b=2<1

	ldc	2
	ldc	1
	if_icmplt	L000
	iconst_0
	goto	L001
L000:
	iconst_1
L001:
	putstatic	ExprTest/b I

; b=3>=3

	ldc	3
	ldc	3
	if_icmpge	L002
	iconst_0
	goto	L003
L002:
	iconst_1
L003:
	putstatic	ExprTest/b I

; b=false||false||true

	iconst_0
	iconst_0
	ior
	iconst_1
	ior
	putstatic	ExprTest/b I

; b=(1>2-3)||(20<3*4)

	ldc	1
	ldc	2
	ldc	3
	isub
	if_icmpgt	L004
	iconst_0
	goto	L005
L004:
	iconst_1
L005:
	ldc	20
	ldc	3
	ldc	4
	imul
	if_icmplt	L006
	iconst_0
	goto	L007
L006:
	iconst_1
L007:
	ior
	putstatic	ExprTest/b I

	getstatic     ExprTest/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
