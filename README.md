Android-fans
============

该仓库用于Android-fans论坛学习git使用

1. 开发人员：A,B,C
2. A ,B具有仓库权限 ，C为贡献着（任何人都可），无写入权限
3. A 在master分支建立基准代码（新建android工程）。
4. A 在master分支基准上建立 develop 远程分支。
5. A ,B在develop分支开发任务。A 开发 AActivity。B 开发 BActivity。B开发速度快，开发完成提交develop。B发现代码效率低，决定使用新办法，又无完全把握，故新建特性分支FeatureA开发。
6. A 开发完成，提交代码到develop分支。
7. 此时，B 运气好，新方法完成，性能提高100倍。于是提交代码。
8. 1.0全部功能完成。A作为项目进经理，决定发布 1.0版本 新建1.0分支，把该分支发布出去。B 继续在develop的分支开始2.0功能开发，新增B2Activity。
9. 1.0版本发布以后，发现了一个bug。A 立即建立 hotfix分支，并将该bug交B去解决，B不得不暂停2.0的开发。
10. B解决完成后提交单代码接着开始2.0的开发，并合并到当前分支
11. A 合并 hotfix分支到 1.0分支，并重新发布出去。
12. 1.0版本在经过了很长一段时间后基本确定无bug问题。A 将1.0合并到naster分支，并打tag 1.0
13. A 加入2.0和B共同开发。
14. 由于该项目为开源项目，长期潜水在Android-fans论坛的C发现了该项目，决定助一臂之力，so C fork了该项目，增加CActivity，通过电子邮件联系了A，发出了一个pull request。A 接收了C的pull request，并合并到当前分支中。
15. continue....



联系方式：tadeshanc@gmail.com
