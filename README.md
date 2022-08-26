# REZZO MES SOLUTION
> **チームで行ったMES生産管理システムプログラムです。** <br>

## ⚙開発環境
+ Windows
+ Eclipse
+ JDK 11
+ Oracle Database 11g
+ Spring
+ gradle
+ Git, GitHub

# Overview
<b>1.注文書管理</b>
<br>
![주문서첫페이지](https://user-images.githubusercontent.com/78412311/186849448-f7949df1-cba4-48cd-ba8a-287847bb4e6a.png)<br>
注文日（現在の日付）を基準で注文書が表示されます。

<b>2.注文書管理</b>
<br>
![주문서추가](https://user-images.githubusercontent.com/78412311/186867408-f843fd65-c543-4ed6-a655-3b6747344152.png)<br>
追加ボタンを押すと新しい注文書が追加出来ます。<br>
![주문서추가모달1](https://user-images.githubusercontent.com/78412311/186867615-242f7cf4-f7e0-4082-8bc2-a25b3e631980.png)<br>
新しく追加された注文書はModalで各項目を選択、入力が出来ます。

<b>3.注文書保存</b>
<br>
![주문서저장](https://user-images.githubusercontent.com/78412311/186868369-0c05cf68-be17-4a73-95cd-e8d5deb32c6f.png)<br>
追加ボタンを押すと新しい注文書の追加が出来ます。

<b>4.注文書エラー</b>
<br>
![주문서저장오류](https://user-images.githubusercontent.com/78412311/186868770-dff796c0-90a2-407b-b845-773a9de162c2.png)<br>
入力が完了されてない注文書を保存する場合はAlertが表示されます。

<b>5.注文書削除</b>
<br>
![주문서삭제](https://user-images.githubusercontent.com/78412311/186869239-531663ba-d8cd-440f-802c-3c44bbf7af7b.png)<br>
注文書の削除が出来ます。

<b>6.注文書検索</b>
<br>
![주문서조회](https://user-images.githubusercontent.com/78412311/186872889-03d1ecb9-e9d3-4d1f-80d6-be1bd2adf0d6.PNG)<br>
条件を選択して注文書の検索が出来ます。<br>
![주문서조회초기화](https://user-images.githubusercontent.com/78412311/186871217-e685e5a0-6acf-45e2-8c2e-db371014a23f.PNG)<br>
検索した注文書が表示されます(Pink)。そして、クリアボタン(Green)を押すと検索条件がクリアになります。

<b>7.商品入庫登録</b>
<br>
![제품입고등록](https://user-images.githubusercontent.com/78412311/186871915-9373bf4a-3299-45fc-a627-0b5e54b48934.PNG)<br>
生産が完了された商品を入庫登録します。検査が完了されたLOT番号を選択、入力します。<br>

![제품입고등록저장](https://user-images.githubusercontent.com/78412311/186873570-70b3d171-6d60-4068-8ba2-6119f9a3d12b.PNG)<br>
入庫数量を入力した上で登録が出来ます。 入庫登録の時、入庫登録番号は自動作成されます。

<b>8.商品出荷登録</b>
<br>
![제품출고등록](https://user-images.githubusercontent.com/78412311/186874624-1966a4a1-5282-43be-8648-1c0606ade1fd.PNG)<br>
出荷されてない注文書を選択し、商品出荷登録が出来ます。<br>

![제품출고등록모달](https://user-images.githubusercontent.com/78412311/186875373-2576403f-8305-402d-9c8e-784a346e8a2b.PNG)<br>
注文書に対する商品を選択し、注文量を入力した上で登録が出来ます。

<b>9.商品出荷登録エラー</b>
<br>
![제품출고등록에러](https://user-images.githubusercontent.com/78412311/186876192-307e59e7-03d1-46ae-bab8-c77659dac187.PNG)<br>
出荷する商品を選択しなかったり注文量を入力しない場合登録ができません。<br>
![출고등록완료](https://user-images.githubusercontent.com/78412311/186877029-ce1657df-bad1-47d9-97b9-a1f37f417bb6.PNG)<br>
出荷登録が完了されたページです。

<b>10.商品出荷検索</b>
<br>
![제품출고조회](https://user-images.githubusercontent.com/78412311/186877322-3503ab46-2ce5-4cf9-bee8-2a74de9eb13a.PNG)<br>
商品名、取引先、出荷日を条件(Green)で商品出荷情報が検索出来ます。（商品名と取引先はキーワード検索が出来ます。）

<b>11.在庫検索</b>
<br>
![제품재고조회](https://user-images.githubusercontent.com/78412311/186878181-ecbb5001-f8f9-4d06-a766-3b25e0981a5f.PNG)<br>
商品名とLOT番号の条件で在庫検索が出来ます。

## [🚩노션](https://www.notion.so/Hello-We-are-REZZO-1d52e4b883464472a85e60293f564b29)
+ [🚘로드맵](https://www.notion.so/dc92a6176f44441196558c8dd4169bc3?v=6a3daae7828e4ec38c039bfab744c67d)<br>
+ [💬회의록](https://www.notion.so/250d931996d84066bacca2ade8a9a425?v=b0bea1b9ac7a421fab4b96a62dd1c7e3)
