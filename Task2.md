# Task 2
 
###### 1. Upload of a file with extention different than allowed
Path 1. User uploads .jpg file.
| No. | Action | Result |
| ------ | ------ |--- |
| 1 | Browse .jpg file | File selected |
| 2 | Upload .jpg file | File is not uploaded. Error message appears |

###### 2. Upload of a huge file
Path 1. In every system must be some file size upload limitation.
| No. | Action | Result |
| ------ | ------ |--- |
| 1 | Browse too big .pdf file | File selected |
| 2 | Upload too big .pdf file | File is not uploaded. Error message appears |

###### 3. Publish last uploaded file
Path 1. I want to check if only last uploaded file is published. This is rather positive scenario but very interesting.
| No. | Action | Result |
| ------ | ------ |--- |
| 1 | Browse first .pdf file | File selected |
| 2 | Upload first .pdf file | File is uploaded|
| 3 | Browse second .pdf file | File selected |
| 4 | Upload second .pdf file | File is uploaded |
| 5 | Publish file | Second file is published |

###### 4. Upload empty file
Path 1. I want to check if there is validation enabled for empty file
| No. | Action | Result |
| ------ | ------ |--- |
| 1 | Browse empty .pdf file | File selected |
| 2 | Upload empty .pdf file | Validation message should appear |

###### 5. Upload empty file
Path 1. I want to check if there is validation enabled for empty file
| No. | Action | Result |
| ------ | ------ |--- |
| 1 | Browse empty .pdf file | File selected |
| 2 | Upload empty .pdf file | Validation message should appear |

###### 6. Unique Id verification
Path 1. I want to check if each file has unique ID in DB even if this is the same file. No duplicates allowed.
| No. | Action | Result |
| ------ | ------ |--- |
| 1 | Browse .pdf file | File selected |
| 2 | Upload .pdf file | Validation message should appear |
| 3 | Verify file ID in DB is unique | File has unique ID |
| 4 | Browse the same as in step 1 .pdf file | File selected |
| 5 | Upload .pdf file | Validation message should appear |
| 6 | Verify file ID in DB is unique | File has unique ID |

###### In addition
I don't know if content of files is read by backend side. If yes this is perfect time to insert some "bad" data like SQL queries hidden in the files content. 




