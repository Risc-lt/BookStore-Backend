use bookstore;

insert into book(author, cover, description, price, title, sales)
values ('[英] 乔治·奥威尔',
        'https://img3m4.ddimg.cn/96/20/25215594-2_u_11.jpg',
        '《1984》是一部杰出的政治寓言小说，也是一部幻想小说。作品刻画了人类在极权主义社会的生存状态，有若一个永不褪色的警示标签，警醒世人提防这种预想中的黑暗成为现实。历经几十年，其生命力益显强大，被誉为20世纪影响最为深远的文学经典之一。',
        2800,
        '1984', 0),
       ('[美] Stanley B. Lippman / [美] Josée Lajoie / [美]',
        'https://img3m5.ddimg.cn/18/16/11186350875-1_u_1.jpg',
        '这本久负盛名的 C++ 经典教程，时隔八年之久，终迎来史无前例的重大升级。除令全球无数程序员从中受益，甚至为之迷醉的——C++ 大师 Stanley B. Lippman 的丰富实践经验，C++标准委员会原负责人 Josée Lajoie 对C++标准的深入理解，以及C+ + 先驱 Barbara E. Moo 在 C++教学方面的真知灼见外，更是基于全新的 C++11标准进行了全面而彻底的内容更新。非常难能可贵的是，本书所有示例均全部采用 C++11 标准改写，这在经典升级版中极其罕见——充分体现了 C++ 语言的重大进展及其全面实践。书中丰富的教学辅助内容、醒目的知识点提示，以及精心组织的编程示范，让这本书在 C++ 领域的权威地位更加不可动摇。无论是初学者入门，或是中、高级程序员提升，本书均为不容置疑的首选。',
        12800,
        'C++ Primer 中文版（第 5 版）', 0),
       ('[美] 凯·S.霍斯特曼（Cay S.Horstmann）',
        'https://img3m8.ddimg.cn/7/0/29411818-1_u_28.jpg',
        '伴随着Java的成长，《Java核心技术》从第1版到第11版一路走来，得到了广大Java程序设计人员的青睐，成为一本畅销不衰的Java经典图书。',
        14900,
        'Java核心技术·卷I（原书第12版）', 0),
       ('[美]粱勇（Y.Daniel Liang）',
        'https://img3m9.ddimg.cn/85/16/25104109-1_u_3.jpg',
        '《Java语言程序设计（基础篇 原书第10版）》是Java语言的经典教材，中文版分为基础篇和进阶篇，主要介绍程序设计基础、面向对象编程、GUI程序设计、数据结构和算法、高级Java程序设计等内容。本书以示例讲解解决问题的技巧，提供大量的程序清单，每章配有大量复习题和编程练习题，帮助读者掌握编程技术，并应用所学技术解决实际应用开发中遇到的问题。您手中的这本是其中的基础篇，主要介绍了基本程序设计、语法结构、面向对象程序设计、继承和多态、异常处理和文本I/O、抽象类和接口等内容。本书可作为高等院校程序设计相关专业的基础教材，也可作为Java语言及编程开发爱好者的参考资料。',
        8500, 'Java语言程序设计（基础篇 原书第10版）', 0),
       ('任洪彩', 'https://img3m9.ddimg.cn/21/0/28986429-1_u_6.jpg',
        '《Go专家编程》深入地讲解了Go语言常见特性的内部机制和实现方式，大部分内容源自对Go语言源码的分析，并从中提炼出实现原理。通过阅读本书，读者可以快速、轻松地了解Go语言的内部运作机制。',
        10800, 'Go专家编程', 0),
       ('白明', 'https://img3m0.ddimg.cn/9/24/29352420-1_u_7.jpg',
        'Go入门容易，精进难，如何才能像Go开发团队那样写出符合Go思维和语言惯例的高质量代码呢？本书将从编程思维和实践技巧2个维度给出答案，帮助你在Go进阶的路上事半功倍。',
        9900, 'Go语言精进之路', 0),
       ('nagano',
        'https://img3m8.ddimg.cn/40/7/11520575788-1_u_1701681733.jpg',
        '又小又可愛的傢伙=通稱「吉伊卡哇」。
吉伊卡哇的好朋友小八貓，
在吉伊卡哇家發現了《拔草撿定5級》的應考書籍。
「考取資格酬勞增加的話，就能買禮物送給大家了！」
看著不擅長念書的吉伊卡哇努力用功的模樣，
小八貓想到了……
又小又可愛，無時無刻都很努力。
當然，不可能每件事都一帆風順，
吉伊卡哇的每一天，也伴隨著辛苦、悲傷和危險。
但是，和*喜歡的朋友一起，明天也會帶著笑容「這樣過生活」。
本書同樣收錄了在這裡才看得到的特別繪製故事哦！',
        6600,
        '吉伊卡哇 這又小又可愛的傢伙 2', 0),
       ('nagano',
        'https://img3m8.ddimg.cn/49/28/11520575698-1_u_1700010618.jpg',
        '《MOGUMOGU邊走邊吃熊》作者nagano繪製的人氣系列終於登場！
由又小又可愛的傢伙=通稱「吉伊卡哇」們所編織出的，
快樂的、苦悶的、也有點艱辛的日日物語。
好想過著受大家喜愛、被溫柔對待的生活……
身邊卻有許多來路不明的人事物！？
不過，和*喜歡的小八貓和兔兔一起，努力過生活的「吉伊卡哇」身邊，
不論何時都洋溢歡笑。
本書當然也收錄了在這裡才看得到的故事！
又一個「nagano WORLD」，在此拉開序幕！',
        6600,
        '吉伊卡哇 這又小又可愛的傢伙 1', 0);
