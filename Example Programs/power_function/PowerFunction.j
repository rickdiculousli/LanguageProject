.class public PowerFunction
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; intx

.field private static x I

; inty

.field private static y I

; intresult

.field private static result I

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method private static exponent(II)I
	.var 0 is base I
	.var 1 is e I
	.var 2 is i I
	.var 3 is temp I

; temp=base

	iload	0
	istore	3

; if(e>0){for(i=1;i<e;i=i+1){base=base*temp;};}else{base=1;}

	iload	1
	ldc	0
	if_icmpgt	L002
	iconst_0
	goto	L003
L002:
	iconst_1
L003:
	ifeq	L001

; for(i=1;i<e;i=i+1){base=base*temp;}

	ldc	1
	istore	2
L004:
	iload	2
	iload	1
	if_icmplt	L006
	iconst_0
	goto	L007
L006:
	iconst_1
L007:
	ifeq	L005

; base=base*temp

	iload	0
	iload	3
	imul
	istore	0
	iload	2
	ldc	1
	iadd
	istore	2
	goto	L004
L005:
	goto	L000
L001:

; base=1

	ldc	1
	istore	0
L000:
	iload	0
	ireturn
.limit locals 4
.limit stack 8
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        PowerFunction/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        PowerFunction/_standardIn LPascalTextIn;

; x=6

	ldc	6
	putstatic	PowerFunction/x I

; y=8

	ldc	8
	putstatic	PowerFunction/y I

; print("Exponentiate: %d to %d th power\n",x,y)

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"Exponentiate: %d to %d th power\n"
	ldc	2
	anewarray	java/lang/Object
	dup
	ldc	0
	getstatic	PowerFunction/x I
	invokestatic	java/lang/Integer.valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	ldc	1
	getstatic	PowerFunction/y I
	invokestatic	java/lang/Integer.valueOf(I)Ljava/lang/Integer;
	aastore
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

; result=exponent(x,y)

	getstatic	PowerFunction/x I
	getstatic	PowerFunction/y I
	invokestatic PowerFunction/exponent(II)I
	putstatic	PowerFunction/result I

; print("return value: %d\n",result)

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"return value: %d\n"
	ldc	1
	anewarray	java/lang/Object
	dup
	ldc	0
	getstatic	PowerFunction/result I
	invokestatic	java/lang/Integer.valueOf(I)Ljava/lang/Integer;
	aastore
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

; x=320

	ldc	320
	putstatic	PowerFunction/x I

; y=0

	ldc	0
	putstatic	PowerFunction/y I

; print("Exponentiate: %d to %d th power\n",x,y)

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"Exponentiate: %d to %d th power\n"
	ldc	2
	anewarray	java/lang/Object
	dup
	ldc	0
	getstatic	PowerFunction/x I
	invokestatic	java/lang/Integer.valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	ldc	1
	getstatic	PowerFunction/y I
	invokestatic	java/lang/Integer.valueOf(I)Ljava/lang/Integer;
	aastore
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

; result=exponent(x,y)

	getstatic	PowerFunction/x I
	getstatic	PowerFunction/y I
	invokestatic PowerFunction/exponent(II)I
	putstatic	PowerFunction/result I

; print("return value: %d\n",result)

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"return value: %d\n"
	ldc	1
	anewarray	java/lang/Object
	dup
	ldc	0
	getstatic	PowerFunction/result I
	invokestatic	java/lang/Integer.valueOf(I)Ljava/lang/Integer;
	aastore
	invokevirtual	java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

	getstatic     PowerFunction/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
