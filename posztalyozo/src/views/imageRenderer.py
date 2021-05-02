
import wx

class ImageRenderer(wx.grid.GridCellRenderer):
    def __init__(self, text):
        wx.grid.GridCellRenderer.__init__(self)
        self.text = text
 
    def Draw(self, grid, attr, dc, rect, row, col, isSelected):
        width = 100
        height = 100
        
        simg = wx.Image(100,100,True)
        simg.Replace(0,0,0,200,200,200)        
        bitmap = simg.ConvertToBitmap()

        tmp_dc = wx.MemoryDC(bitmap)
        tmp_dc.SetTextForeground(wx.BLACK)
        tmp_dc.DrawRotatedText(self.text, 5, 90, 90)

        if isSelected:
            dc.SetBrush(wx.Brush(wx.BLUE, wx.SOLID))
            dc.SetPen(wx.Pen(wx.BLUE, 1, wx.SOLID))
        else:
            dc.SetBrush(wx.Brush(wx.WHITE, wx.SOLID))
            dc.SetPen(wx.Pen(wx.WHITE, 1, wx.SOLID))
        dc.DrawRectangle(rect)
        if width > rect.width-2:
            width = rect.width-2
        if height > rect.height-2:
            height = rect.height-2
        dc.Blit(rect.x + 1, rect.y + 1, width, height, tmp_dc, 0, 0, wx.COPY, True)

